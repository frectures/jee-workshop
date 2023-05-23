package jsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.time.LocalDateTime;

@Named
@RequestScoped
public class FredsBean {
    public LocalDateTime getJetzt() {
        return LocalDateTime.now();
    }
}
