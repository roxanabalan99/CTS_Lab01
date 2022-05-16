package builder_solved;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class User {
	
	//aici ctrs&setters se fac private
	
	private User() {
		super();
	}
	
	// mandatory
	private String username;
	

	private String email;
	private String firstName;
	private String lastName;

	// optional
	private String phoneNo;
	private String address;
	private String birthday;

		//NEAPARAT STATIC AICI!!
		public static class UserBuilder{
			// mandatory
			private User user = new User();
			
			public UserBuilder(String username, String email, String firstName, String lastName) {
				super();
				this.user.username = username;
				this.user.email = email;
				this.user.firstName = firstName;
				this.user.lastName = lastName;
			}
			
			public UserBuilder birthday(String birthday) {
				this.user.birthday = birthday;
				return this;
			}
			
			public UserBuilder address(String address) {
				this.user.address = address;
				return this;
			}
			
			public UserBuilder phoneNo(String phoneNo) {
				this.user.phoneNo = phoneNo;
				return this;
			}
			
			//obligatoriu pt legatura dintre User si Builder
			public User build() {
				return this.user;
			}
			
			
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("User [username=");
			builder.append(username);
			builder.append(", email=");
			builder.append(email);
			builder.append(", firstName=");
			builder.append(firstName);
			builder.append(", lastName=");
			builder.append(lastName);
			builder.append(", phoneNo=");
			builder.append(phoneNo);
			builder.append(", address=");
			builder.append(address);
			builder.append(", birthday=");
			builder.append(birthday);
			builder.append("]");
			return builder.toString();
		}
		
		
}
