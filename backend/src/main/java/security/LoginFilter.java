package security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static security.Constants.TOKEN_URL;


public class LoginFilter  extends  UsernamePasswordAuthenticationFilter{
    private final AuthenticationManager authenticationManager;
    private final JwtManager tokenManager;
    private final ObjectMapper mapper;

    public LoginFilter(AuthenticationManager authenticationManager, JwtManager tokenManager,
                       ObjectMapper mapper) {
        this.authenticationManager = authenticationManager;
        this.tokenManager = tokenManager;
        this.mapper = mapper;
        super.setFilterProcessesUrl(TOKEN_URL);
    }
}
