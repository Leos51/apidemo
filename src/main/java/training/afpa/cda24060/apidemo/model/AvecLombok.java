package training.afpa.cda24060.apidemo.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;

import java.io.InputStream;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter @Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Log4j2 @ToString
public class AvecLombok {

    @NonNull
    String nom;

    @NonNull
    String prenom;

    @ToString.Exclude
    int age;

    public void test(){
        try{
            @Cleanup
            InputStream is = this.getClass().getResourceAsStream("fichier.txt");
        } catch (Exception e) {
            log.info("erreur : " + e.getMessage());
        }
    }
}
