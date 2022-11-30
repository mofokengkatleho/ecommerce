package com.example.ecommerce.hateoas;

import com.example.ecommerce.controller.PaymentController;
import com.example.ecommerce.entity.PaymentEntity;
import com.example.ecommerce.model.Payment;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import static java.util.stream.Collectors.toList;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@Component
public class PaymentRepresentationModelAssembler extends
    RepresentationModelAssemblerSupport<PaymentEntity, Payment> {

  /**
   * Creates a new {@link RepresentationModelAssemblerSupport} using the given controller class and
   * resource type.
   */
  public PaymentRepresentationModelAssembler() {
    super(PaymentController.class, Payment.class);
  }

  /**
   * Coverts the Payment entity to resource
   *
   * @param entity
   */
  @Override
  public Payment toModel(PaymentEntity entity) {
    Payment resource = createModelWithId(entity.getId(), entity);
    BeanUtils.copyProperties(entity, resource);
    resource.setId(entity.getId().toString());
    // Self link generated by createModelWithId has missing api path. Therefore generating additionally.
    // can be removed once fixed.
    resource.add(linkTo(
        methodOn(PaymentController.class).getOrdersPaymentAuthorization(entity.getId().toString()))
        .withSelfRel());
    return resource;
  }

  /**
   * Coverts the collection of Product entities to list of resources.
   *
   * @param entities
   */
  public List<Payment> toListModel(Iterable<PaymentEntity> entities) {
    if (Objects.isNull(entities)) {
      return Collections.emptyList();
    }
    return StreamSupport.stream(entities.spliterator(), false).map(e -> toModel(e))
        .collect(toList());
  }

}




semitone-difference-basic-algorithm-javascript-1/src/semitone-gui.js' from origin 'null' has been blocked by CORS policy: Cross origin requests are only supported for protocol schemes: http, data, isolated-app, chrome-extension, chrome, https, chrome-untrusted. Access to script at 'file:///home/sinenhlanhla/Katleho-Mofokeng-199-semitone-difference-basic-algorithm-javascript-1/src/semitone-gui.js' from origin 'null' has been blocked by CORS policy: Cross origin requests are only supported for protocol schemes: http, data, isolated-app, chrome-extension, chrome, https, chrome-untrusted. cdn.tailwindcss.com should not be used in production. To use Tailwind CSS in production, install it as a PostCSS plugin or use the Tailwind CLI: https://tailwindcss.com/docs/installation
