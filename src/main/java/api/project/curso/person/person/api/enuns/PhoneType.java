package api.project.curso.person.person.api.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME("Residencial"),
    MOBILE("Celular"),
    COMMERCIAL("Comercial");

    private final String description;
}
