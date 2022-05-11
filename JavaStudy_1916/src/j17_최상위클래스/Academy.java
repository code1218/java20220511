package j17_최상위클래스;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@RequiredArgsConstructor
@AllArgsConstructor //전체생성자
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Academy {
	private final String name; // 코리아아이티아카데미
	private final String address; // 부산지점
	private String subject; // IT
}
