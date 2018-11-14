package io.mosip.registration.repositories;

import java.util.List;

import io.mosip.kernel.core.dataaccess.spi.repository.BaseRepository;
import io.mosip.registration.entity.RegistrationUserPassword;
import io.mosip.registration.entity.RegistrationUserPasswordId;

/**
 * The repository interface for {@link RegistrationUserPassword} entity
 * 
 * @author Sravya Surampalli
 * @since 1.0.0
 *
 */

public interface RegistrationUserPasswordRepository
		extends BaseRepository<RegistrationUserPassword, RegistrationUserPasswordId> {

	/**
	 * This method returns the list of {@link RegistrationUserPassword} based on
	 * registrationUserPasswordID
	 * 
	 * @param registrationUserPasswordID
	 *            the registration user password composite key
	 * @return the list of {@link RegistrationUserPassword}
	 */

	List<RegistrationUserPassword> findByRegistrationUserPasswordIdUsrIdAndIsActiveTrue(String usrId);
}
