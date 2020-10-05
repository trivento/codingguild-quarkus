package nl.trivento.codeguild.quarkus.persoon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("persoon")
@Produces(MediaType.APPLICATION_JSON)
public class PersoonResource {

    @GET
    public Response getPersonen() {
        List<Persoon>  personen = new ArrayList<>();
        Persoon persoon = new Persoon();
        persoon.setVoornaam("Olaf");
        persoon.setAchternaam("van Tintelen");
        persoon.setGeboortedatum(LocalDate.of(1971, 11, 17));
        persoon.setEmail("olaf.van.tintelen@trivento.nl");
        personen.add(persoon);

        persoon = new Persoon();
        persoon.setVoornaam("Ruud");
        persoon.setAchternaam("van Vliet");
        persoon.setGeboortedatum(LocalDate.of(1968, 11, 17));
        persoon.setEmail("ruud.van.vliet@trivento.nl");
        personen.add(persoon);
        return Response.ok(personen).build();
    }
}
