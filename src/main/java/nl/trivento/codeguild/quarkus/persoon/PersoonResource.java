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
        persoon.setVoornaam("Donal");
        persoon.setAchternaam("Duck");
        persoon.setGeboortedatum(LocalDate.of(1971, 11, 17));
        persoon.setEmail("donald.duckn@tduckstd.nl");
        personen.add(persoon);

        persoon = new Persoon();
        persoon.setVoornaam("Mickey");
        persoon.setAchternaam("Mouse");
        persoon.setGeboortedatum(LocalDate.of(1968, 07, 01));
        persoon.setEmail("mickey.mouse@duckstad.nl");
        personen.add(persoon);
        return Response.ok(personen).build();
    }
}
