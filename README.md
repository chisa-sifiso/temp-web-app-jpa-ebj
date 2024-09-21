<h1>Temperature Classifier EJB Application</h1> <p>This Java EE application uses a stateless Enterprise Java Bean (EJB) to classify temperatures and provide advice based on the classification. The temperature is received from the front-end, categorized by the EJB, and then advice is provided depending on the temperature category.</p> <h2>Overview</h2> <p>The application is developed using:</p> <ul> <li><img src="https://img.icons8.com/color/48/000000/java-coffee-cup-logo.png" alt="Java Icon" width="20" height="20"/> <strong>Java EE</strong> for servlets, business logic, and EJB</li> <li><img src="https://img.icons8.com/color/48/000000/netbeans.png" alt="NetBeans Icon" width="20" height="20"/> <strong>NetBeans IDE</strong> for development</li> <li><img src="https://img.icons8.com/color/48/000000/glassfish.png" alt="GlassFish Icon" width="20" height="20"/> <strong>GlassFish Server</strong> for deployment</li> <li><img src="https://img.icons8.com/external-outline-geotatah/64/000000/external-ejb-cloud-geotatah-outline-geotatah.png" alt="EJB Icon" width="20" height="20"/> <strong>Stateless EJB</strong> to handle temperature classification logic</li> </ul> <h2>Features:</h2> <ol> <li><strong>Classify Temperature</strong>: The application receives a temperature value from the front-end and categorizes it as either "High" or "Low."</li> <li><strong>Provide Advice</strong>: Based on the temperature category, the application provides advice. For example: <ul> <li>"High temperature. Please see a doctor!" if the temperature is classified as high.</li> <li>"Normal temperature. Keep it up!" if the temperature is low.</li> </ul> </li> </ol> <h2>Technologies Used</h2> <ul> <li><img src="https://img.icons8.com/color/48/000000/java-coffee-cup-logo.png" alt="Java Icon" width="20" height="20"/> <strong>Java EE</strong>: Servlets and EJB for business logic</li> <li><img src="https://img.icons8.com/external-outline-geotatah/64/000000/external-ejb-cloud-geotatah-outline-geotatah.png" alt="EJB Icon" width="20" height="20"/> <strong>EJB (Enterprise Java Beans)</strong>: Stateless session beans for the core temperature classification and advice logic</li> <li><img src="https://img.icons8.com/color/48/000000/glassfish.png" alt="GlassFish Icon" width="20" height="20"/> <strong>GlassFish Server</strong>: Used as the application server</li> <li><img src="https://img.icons8.com/color/48/000000/netbeans.png" alt="NetBeans Icon" width="20" height="20"/> <strong>NetBeans IDE</strong>: Development environment for managing the project</li> </ul> <h2>Project Structure</h2> <ul> <li><strong>Source Packages</strong>: <ul> <li><strong>Business Logic</strong>: <p>`TemperatureClassifierSB`: Stateless session bean that contains: <ul> <li>`classifyTemperature(Double temp)`: Categorizes the temperature as "High" or "Low."</li> <li>`advice(String category)`: Provides advice based on the category of the temperature.</li> </ul> </p> </li> <li><strong>EJB Interface</strong>: <p>`TemperatureClassifierSBLocal`: Local interface for the business logic.</p> </li> </ul> </li> </ul> <h2>How it Works</h2> <ol> <li><strong>Temperature Classification</strong>: The `classifyTemperature()` method categorizes the temperature: <ul> <li>Temperatures above 38°C are categorized as "High."</li> <li>Temperatures at or below 38°C are categorized as "Low."</li> </ul> </li> <li><strong>Providing Advice</strong>: The `advice()` method takes the temperature category and returns advice: <ul> <li>If categorized as "High," it advises the user to see a doctor.</li> <li>If categorized as "Low," it tells the user their temperature is normal.</li> </ul> </li> </ol> <h2>Deployment</h2> <ol> <li>Open the project in <strong>NetBeans IDE</strong>.</li> <li>Deploy the application to <strong>GlassFish Server</strong>.</li> <li>The front-end will send temperature data to the backend, and the stateless EJB will process it and return advice.</li> </ol>
