🧩 1. Bean Configuration Details
🏷️ <bean> tag
The <bean> tag in Spring's XML configuration defines a bean (i.e., a Java object) that will be created, managed and injected by the Spring IoC container.

⚙️ id attribute
Represents the unique name for the bean within the Spring container.

Used to retrieve the bean using context.getBean("id").

📦 class attribute
Fully qualified Java class name that Spring should instantiate.

🛠️ <property> tag
Used to set the properties (fields) of the bean via setters.

✏️ name attribute
The name of the property in the Java class to be set.

🔡 value attribute
The value assigned to the specified property.

🔹 ApplicationContext
Core interface in Spring for accessing the IoC container.

Manages beans, their lifecycle, configuration and dependencies.

🔹 ClassPathXmlApplicationContext
A specific implementation of ApplicationContext
Loads XML configuration file from the classpath (e.g. src/main/resources).

When context.getBean("country", Country.class) is invoked:
Spring looks up the <bean id="country"> in country.xml.

It creates a Country object using the no-arg constructor (logs: Inside Country Constructor).

Then it sets the properties using the setters setCode("IN") and setName("India") (logs show each setter call).

Finally, it returns the fully initialized bean ready for use.

This process shows how Spring handles object creation and wiring automatically.

Loads XML configuration file from the classpath (e.g., src/main/resources).
