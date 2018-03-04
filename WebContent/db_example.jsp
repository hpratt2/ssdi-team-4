<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>

<HTML>
	<HEAD>
		<TITLE>Team Database</TITLE>
	</HEAD>
	<BODY>
		<H1>Team Database</H1>
		<%
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/example?user=root&password=password");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from team4");
		%>
		
		<TABLE BORDER="1">
			<TR>
				<TH>First Name</TH>
				<TH>Last Name</TH>
				<TH>Email</TH>
			</TR>
			<% while(rs.next()){ %>
			<TR>
				<TD><%= rs.getString(1) %></TD>
				<TD><%= rs.getString(2) %></TD>
				<TD><%= rs.getString(3) %></TD>
			</TR>
			<% } %>
		</TABLE>
	</BODY>
</HTML>
