In the controller method:
When a GET request is made to /country, the method getCountryIndia() runs.

It uses Spring's ApplicationContext to load the in bean from country.xml.

This bean is a Java object of type Country (with fields code=IN, name=India)

The method returns that object.


Bean is converted into JSON reponse:

Spring Boot uses the Jackson library (auto-included in Spring Web Starter).

When the controller returns a Country object:

Spring automatically serializes it to JSON.

This happens because of @RestController which combines @Controller + @ResponseBody.

So this:
return new Country("IN", "India");
Becomes:

{
  "code": "IN",
  "name": "India"
}
