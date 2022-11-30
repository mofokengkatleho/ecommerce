package security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class LoginFilter  extends  UsernamePasswordAuthenticationFilter{
    private final AuthenticationManager authenticationManager;
    private final JwtManager tokenManager;
    private final ObjectMapper mapper;
}
