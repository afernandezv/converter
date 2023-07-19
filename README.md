# Conversor de divisas y unidades de medida
Aplicación de escritorio diseñada para realizar conversiones de divisas y unidades de medida, diseñada con Java y JavaFX
## Tecnologías, librerías y API's utilizadas
* Se utilizó el JDK de [Adoptium](https://adoptium.net/es/) en su versión 17.
* El IDE utilizado fue [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/).
* Para el diseño de la interfaz gráfica se hizo uso de [JavaFX (OpenJFX)](https://openjfx.io/) en conjunto con [Scene Builder](https://gluonhq.com/products/scene-builder/) 
* La librería [Gson](https://github.com/google/gson) se utilizó para convertir los objetos JSON, obtenidos en las peticiones a las API's, en objetos Java.
* Las librerías [Ikonli](https://kordamp.org/ikonli/), [FontAwesome5](https://kordamp.org/ikonli/#_fontawesome5_latest) y [MaterialDesign2](https://kordamp.org/ikonli/#_materialdesign2_latest) fueron utilizadas para los iconos de la aplicación.
* [Currency Conversion API](https://api-ninjas.com/api/convertcurrency) se utiliza en la conversion de divisas.
* [Measurement Unit Converter API](https://rapidapi.com/me-Egq5JBzo4/api/measurement-unit-converter) utilizada en la conversion de unidades de medida.
## Funcionalidades
Actualmente la aplicación puede realizar conversiones entre las siguientes divisas y unidades de medida:
### Divisas
* Dólar Estadounidense (USD)
* Euro (EUR)
* Libra Esterlina (GBP)
* Peso Mexicano (MXN)
* Won Surcoreano (KRW)
* Yen Japonés (JYP)
### Unidades de masa
* Microgramo (mcg)
* Miligramo (mg)
* Gramo (g)
* Kilogramo (kg)
* Tonelada métrica (mt)
* Onza (oz)
* Libra (lb)
### Unidades de longitud
* Nanómetros (nm)
* Micrómetros (μm)
* Milímetros (mm)
* Centímetros (cm)
* Metros (m)
* Kilómetros (km)
* Pulgadas (in)
* Pies (ft)
* Yardas (yd)
* Millas (mi)
### Unidades de temperatura
* Grados Centígrados (°C)
* Grados Fahrenheit (°F)
* Kelvin (K)
* Grados Rankine (°R)
## Limitaciones
* Es necesaria una conexión a internet para el consumo de las API's
* Número limitado de peticiones a las API's. En el caso de [Currency Conversion API](https://api-ninjas.com/api/convertcurrency) solo se pueden realizar 100 peticiones diarias y 50,000 peticiones mensuales para [Measurement Unit Converter API](https://rapidapi.com/me-Egq5JBzo4/api/measurement-unit-converter).
## Funcionamiento
https://github.com/afernandezv/converter/assets/9130344/061f692b-c833-4b22-90ef-5f0ff8231f00
## Trabajo a futuro
### Funcionalidades
* Implementar un modo offline para realizar las conversiones sin la necesidad de API's.
* Añadir soporte para más divisas y unidades de medida.
### Diseño e interacción
* Mejoras en la UX y la UI.
