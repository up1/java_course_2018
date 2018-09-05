package day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoTryCatch {
	
	public void sample() {
		// try-resources-catch
		try (
			 Connection connection = 
				     DriverManager.getConnection("", "", "");
			 PreparedStatement preparedStatement = 
					 connection.prepareStatement("sql");
				) {
			
			ResultSet result = 
					preparedStatement.executeQuery();
			while(result.next()) {
				result.getInt("id");
			}

		} catch (Exception e) {

		} 
	}

	public void sampleLegacy() {
		// try-catch-finally
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mariadb");
			connection = DriverManager.getConnection("", "", "");
			preparedStatement = connection.prepareStatement("sql");

		} catch (Exception e) {

		} finally {
			releasedResources(connection, preparedStatement);
		}
	}

	private void releasedResources(Connection connection, PreparedStatement preparedStatement) {
		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
			}
			preparedStatement = null;
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
			}
			connection = null;
		}
	}

	public static void main(String[] args) {

	}

}
