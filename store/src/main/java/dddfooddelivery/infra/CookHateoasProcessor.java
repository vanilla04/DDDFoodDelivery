package dddfooddelivery.infra;
import dddfooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class CookHateoasProcessor implements RepresentationModelProcessor<EntityModel<Cook>>  {

    @Override
    public EntityModel<Cook> process(EntityModel<Cook> model) {

        
        return model;
    }
    
}
