package io.corbs.baseballdb;

import io.corbs.baseballdb.schema.tables.pojos.Master;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static io.corbs.baseballdb.schema.tables.Master.MASTER;

@RestController
public class MasterAPI {

    private final DSLContext dsl;

    @Autowired
    public MasterAPI(DSLContext dsl){
        this.dsl = dsl;
    }

    /**
     * Fetch one player
     * @param playerId
     * @return
     */
    @GetMapping("/players/{playerId}")
    public List<Master> getPlayer(@PathVariable String playerId) {
        List<Master> players = dsl.select()
            .from(MASTER)
            .where(MASTER.PLAYERID.eq(playerId))
            .fetch().into(Master.class);

        return players;
    }

    /**
     * Fetch players by firstname
     * @param firstname
     * @return
     */
    @GetMapping(path = "/players", params = {"firstname"})
    public List<Master> getPlayersByFirstname(@RequestParam String firstname) {
        return dsl.select()
                .from(MASTER)
                .where(MASTER.NAMEFIRST.eq(firstname))
                .fetch().into(Master.class);
    }

    /**
     * Fetch players by lastname
     * @param lastname
     * @return
     */
    @GetMapping(path = "/players", params = {"lastname"})
    public List<Master> getPlayersByLastname(@RequestParam String lastname) {
        return dsl.select()
                .from(MASTER)
                .where(MASTER.NAMELAST.eq(lastname))
                .fetch().into(Master.class);
    }
    /**
     * Fetch all players by first and last name
     * @return
     */
    @GetMapping(path = "/players", params = {"firstname", "lastname"})
    public List<Master> getPlayersByFirstnameLastname(
        @RequestParam String firstname, @RequestParam String lastname) {

        return dsl.select()
                .from(MASTER)
                .where(MASTER.NAMEFIRST.eq(firstname))
                .and(MASTER.NAMELAST.eq(lastname))
                .fetch().into(Master.class);
    }

    /**
     * Fetch all players
     * @return
     */
    @GetMapping(path="/players")
    public List<Master> getPlayers() {
        return dsl.select()
                .from(MASTER)
                .fetch().into(Master.class);
    }
}
