package net.rku.opnv.studentticketapi.control;

import java.time.LocalDate;
import java.time.Period;

import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import net.rku.opnv.studentticketapi.exceptions.ValidationException;
import net.rku.opnv.studentticketapi.models.Contact;
import net.rku.opnv.studentticketapi.models.Request;
import net.rku.opnv.studentticketapi.models.Sibling;

@Component
public class RequestValidator {

	public void validateRequest(final @NonNull Request rq) {
		checkAllContactsAreValid(rq);
		checkCustomerAge(rq);
	}

	private void checkCustomerAge(@NonNull final Request rq) {
		LocalDate curDate = LocalDate.now();
		int age = Period.between(rq.getStudent().getBirthday(), curDate).getYears();

		if (age < 18 && rq.getRepresentative() == null) {
			throw new ValidationException("Customers under the age of 18 need a Representative");
		}

	}

	private void checkAllContactsAreValid(@NonNull final Request rq) {
		checkContactValidity(rq.getStudent());
		checkContactValidity(rq.getRepresentative());

		if (rq.getSiblings() != null) {
			for (Sibling s : rq.getSiblings()) {
				checkContactValidity(s.getCustomer());
			}
		}

		if (rq.getPaymentDetails() != null) {
			checkContactValidity(rq.getPaymentDetails().getPayer());
		}
	}

	private void checkContactValidity(@Nullable Contact c) {
		if (c != null) {
			checkPerson(c);
		}
	}

	private void checkPerson(@NonNull Contact c) {
		if (StringUtils.isBlank(c.getFirstname()))
			throw new ValidationException("Firstname must be filled in Person");

		if (StringUtils.isBlank(c.getLastname()))
			throw new ValidationException("Lastname must be filled in Person");

		if (c.getSex() == null)
			throw new ValidationException("Sex must be filled in Person");

		checkAdress(c);

	}

	private void checkAdress(@NonNull Contact c) {

		boolean poBox = StringUtils.isNotEmpty(c.getPobox());
		boolean adressFields = StringUtils.isNoneEmpty(c.getStreet(), c.getStreetnumber(), c.getPostalcode());

		boolean commonFields = StringUtils.isNoneEmpty(c.getCity());

		if (!commonFields) 
			throw new ValidationException("City must be filled in Person");
		
		
		if(poBox ^ adressFields) 
			throw new ValidationException("Either Postbox or Adress field must be filled");
		
		
		

	}

}
