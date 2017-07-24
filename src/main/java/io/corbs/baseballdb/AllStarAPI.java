package io.corbs.baseballdb;

import io.corbs.baseballdb.schema.tables.pojos.Allstarfull;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static io.corbs.baseballdb.schema.tables.Allstarfull.ALLSTARFULL;

@RestController
public class AllStarAPI {

    private final DSLContext dsl;

    @Autowired
    public AllStarAPI(DSLContext dsl){
        this.dsl = dsl;
    }

    @GetMapping("/allstars/{playerId}")
    public List<Allstarfull> getAllstar(@PathVariable String playerId) {
        List<Allstarfull> record = dsl.select()
            .from(ALLSTARFULL)
            .where(ALLSTARFULL.PLAYERID.eq(playerId))
                .fetch().into(Allstarfull.class);

        return record;
    }

}


