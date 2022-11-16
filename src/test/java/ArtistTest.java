import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArtistTest {

    Artist picasso;

    @BeforeEach
    public void setUp() {
        picasso = new Artist("picasso");
    }

    @Test
    public void hasName() {
        assertThat(picasso.getName()).isEqualTo("picasso");
    }

}
