/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.ecommerce;

import com.example.ecommerce.model.Authorization;
import com.example.ecommerce.model.Shipment;
import com.example.ecommerce.model.ShippingReq;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "Shipping", description = "the Shipping API")
public interface ShippingApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/v1/shipping : Return the Shipment
     * Return the Shipment for the specified order
     *
     * @param id Order Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Return the Shipment", nickname = "getShipmentByOrderId", notes = "Return the Shipment for the specified order", response = Shipment.class, responseContainer = "List", tags={ "shipping", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = Shipment.class, responseContainer = "List") })
    @RequestMapping(value = "/api/v1/shipping",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Shipment>> getShipmentByOrderId(@NotNull @ApiParam(value = "Order Identifier", required = true) @Valid @RequestParam(value = "id", required = true) String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"carrier\" : \"carrier\", \"estDeliveryDate\" : \"2000-01-23\", \"orderId\" : \"orderId\", \"trackingNumber\" : \"trackingNumber\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Shipment> <orderId>aeiou</orderId> <carrier>aeiou</carrier> <trackingNumber>aeiou</trackingNumber> <estDeliveryDate>2000-01-23</estDeliveryDate> </Shipment>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v1/shipping : Ship the specified shipping request
     * Ship the specified shipping request
     *
     * @param shippingReq  (optional)
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Ship the specified shipping request", nickname = "shipOrder", notes = "Ship the specified shipping request", response = Authorization.class, tags={ "shipping", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = Authorization.class) })
    @RequestMapping(value = "/api/v1/shipping",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/xml", "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Authorization> shipOrder(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) ShippingReq shippingReq) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"orderId\" : \"orderId\", \"authorized\" : true, \"time\" : \"2000-01-23T04:56:07.000+00:00\", \"message\" : \"message\", \"error\" : \"error\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Authorization> <orderId>aeiou</orderId> <time>2000-01-23T04:56:07.000Z</time> <authorized>true</authorized> <message>aeiou</message> <error>aeiou</error> </Authorization>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}