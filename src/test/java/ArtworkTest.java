import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArtworkTest {



    Artwork artwork1;

    @BeforeEach
    public void setUp(){
        artwork1 = new Artwork("monalisa", "picasso", 4, "token1");
    }

    @Test
    public void hasTitle(){
        assertThat(artwork1.getTitle()).isEqualTo("monalisa");
    }

    @Test
    public void hasArtist(){
        assertThat(artwork1.getArtist()).isEqualTo("picasso");
    }

    @Test
    public void hasPrice(){
        assertThat(artwork1.getPrice()).isEqualTo(4);
    }

    @Test
    public void hasNft(){
        assertThat(artwork1.getNft()).isEqualTo("token1");
    }



}
