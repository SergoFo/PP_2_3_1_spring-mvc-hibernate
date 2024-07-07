package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на классы конфигурации корневого контекста
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
                DatabaseConfig.class // Здесь можно указать конфигурацию базы данных и других общих компонентов
        };
    }


    // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
    // Метод, указывающий на классы конфигурации для DispatcherServlet
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class // Здесь указываем конфигурацию веб-уровня, включая настройку ViewResolver
        };
    }


    /* Данный метод указывает url, на котором будет базироваться приложение */
    // Метод, указывающий URL-мэппинг для DispatcherServlet
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}