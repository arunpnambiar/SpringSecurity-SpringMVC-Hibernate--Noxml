/*package com.schoolerp.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.schoolerp.config"})
@PropertySource(value={"classpath:application.properties"})
public class hibernateConfig {
	@Autowired
	private Environment environment;
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory =new LocalSessionFactoryBean();
		sessionFactory.setDataSource(datasource());
		sessionFactory.setPackagesToScan(new String[] {"com.schoolerp.model"});
		sessionFactory.setHibernateProperties(hibernateProperty());
		return sessionFactory;
	}
	
	private Properties hibernateProperty() {
		Properties properties=new Properties();
		properties.put("hibernate.dialect",environment.getRequiredProperty("hibernate.dialect") );
		properties.put("hibernate.show_sql",environment.getRequiredProperty("hibernate.show_sql") );
		properties.put("hibernate.format_sql",environment.getRequiredProperty("hibernate.format_sql") );
		return properties;
	}

	@Bean
	public DataSource datasource() {
		ComboPooledDataSource datasource = new ComboPooledDataSource();
		try {
			datasource.setDriverClass("com.mysql.jdbc.Driver");
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		datasource.setJdbcUrl(environment.getRequiredProperty("database.url"));
		datasource.setUser(environment.getRequiredProperty("database.username"));
		datasource.setPassword(environment.getRequiredProperty("database.password"));
		datasource.setInitialPoolSize(Integer.parseInt(environment.getProperty("connection.pool.initialPoolSize")));
		datasource.setMinPoolSize(Integer.parseInt(environment.getProperty("connection.pool.minPoolSize")));
		datasource.setMaxPoolSize(Integer.parseInt(environment.getProperty("connection.pool.maxPoolSize")));		
		datasource.setMaxIdleTime(Integer.parseInt(environment.getProperty("connection.pool.maxIdleTime")));
		return datasource;
	}
		@Bean
	    @Autowired
	    public HibernateTransactionManager transactionManager(SessionFactory s) {
	       HibernateTransactionManager txManager = new HibernateTransactionManager();
	       txManager.setSessionFactory(s);
	       return txManager;
	    }
}
*/