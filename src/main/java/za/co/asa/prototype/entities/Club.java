package za.co.asa.prototype.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Club {
    @Id
    private String id;
    private String clubName;
    private String clubAvatar;

}
