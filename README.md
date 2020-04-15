### Feign fallback example

1) start client

2) start service-one, service-two, service-three

The `client` calls `service-one` through Feign and receives the string `"Get String from SERVICE-ONE"`.

The `сlient` also calls `service-two` through Feign and gets the string `"Get String from SERVICE-TWO"`.

#### Prerequisite:

in case of unavailability of `service-two`, the `client` must call the Fallback class in which the call to `service-three` is indicated
and instead of `"Get String from SERVICE-TWO"`, the `client` should get `"Get String from SERVICE-THREE"` from `service-three`.

#### Testing

If you go to the client url

    http://localhost:8070/getDataFromServiceOneByFeign

you will get information from service-one

    "Get String from SERVICE-ONE"
    
If you go to the client url

    http://localhost:8070/getDataFromServiceTwoByFeign

you will get information from service two

    "Get String from SERVICE-TWO"
    
Stop service-two and try calling again

    http://localhost:8070/getDataFromServiceTwoByFeign
    
In this case, you will receive information from the service-three

    "Get String from SERVICE-THREE"