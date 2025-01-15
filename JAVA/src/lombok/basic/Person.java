package lombok.basic;

import lombok.Data;

// @Data 어노테이션은 @Getter, @Setter, @ToString, @RequiredArgsConstructor, @EqualsHashCode 를 자동생성한다
@Data
public class Person {

	private String name;
	private int age;
	private double weight;
	private double height;
}
