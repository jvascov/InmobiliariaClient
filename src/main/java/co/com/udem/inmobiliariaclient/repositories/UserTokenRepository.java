package co.com.udem.inmobiliariaclient.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.com.udem.inmobiliariaclient.entities.UserToken;

public interface UserTokenRepository extends CrudRepository<UserToken, Long> {

	
	@Query("SELECT u.token FROM UserToken u WHERE u.username = ?1")
	   public String obtenerToken(String username);
	
	@Query("SELECT u FROM UserToken u WHERE u.username = ?1")
	   public Optional<UserToken> obtenerEntidadToken(String username);
}
