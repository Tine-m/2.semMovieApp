# 2.semMovieApp

<li> Exercises fetch data in database and display data in @ResponseBody (no html pages) 
<li> DBManager class reads connection information (database url, username, password)  from applications.properties.
<li> po.xml has MySQL driver dependency
<li> DBManager class is Singleton to hold only one instance of JDBC Connection open
<li> Sql script is placed in resources folder
