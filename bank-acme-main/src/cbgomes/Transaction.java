/**
 * 
 */
package cbgomes;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author cbgomes
 *
 */
@Getter
@Setter
public class Transaction {

	private Account account;
	private Double value;
	private LocalDateTime dateTimeTrasaction;
	private String typeTransaction;
}
