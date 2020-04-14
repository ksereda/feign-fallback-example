### Feign fallback example

1) start client

2) start service-one, service-two, service-three

The `client` calls `service-one` through Feign and receives the string `"Get String from SERVICE-ONE"`.

Еру `сlient` also calls `service-two` through Feign and gets the string `"Get String from SERVICE-TWO"`.

#### Prerequisite:

in case of unavailability of `service-two`, the `client` must call the Fallback class in which the call to `service-three` is indicated
and instead of `"Get String from SERVICE-TWO"`, the `client` should get `"Get String from SERVICE-THREE"` from `service-three`.