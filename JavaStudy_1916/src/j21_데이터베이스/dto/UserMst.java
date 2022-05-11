package j21_데이터베이스.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserMst extends User{
	private int usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	private LocalDateTime create_date;
	private LocalDateTime update_date;
}







