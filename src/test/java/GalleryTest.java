import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Louvre");
    }

    @Test
    public void hasName() {
        assertThat(gallery.getName()).isEqualTo("Louvre");
    }

    @Test
    public void canAddMoney() {
        double till = 200;
        double price = 100;
        // assertThat(artwork.price()).isEqualTo(300);

    }




}

