This project demonstrate different ways of converting JSON to Java and Vise Versa using Jackson Binding and GSON API.

* Console Output

	=================================================================
    Example 1: JSON to Java Conversion with implicit Json String
	=================================================================
	----- JSON -----
	
	{"userId": 1, "id": 1, "title": "this is the title", "body": "this is the body" }
	
	------ Java Object ------
	
	[
	 userId: 1
	 id: 1
	 title: this is the title
	 body: this is the body
	]
	=================================================================
	    Example 2: JSON to Java Conversion with implicit Json String
	=================================================================
	----- JSON -----
	
	{"userId": 1, "id": 1, "title": "this is the title", "body": "this is the body" }
	
	------ Java Object ------
	
	[
	 userId: 1
	 id: 1
	 title: this is the title of user
	 body: this is the body of the user
	]
	=================================================================
	    Example 3: JSON to Java Conversion with implicit Json String
	=================================================================
	----- JSON -----
	
	{"userId": 1, "id": 1, "title": "this is the title", "body": "this is the body" }
	[
	 userId: 1
	 id: 1
	 title: this is the title of user 1
	 body: this is the body of the user 1
	]
	[
	 userId: 1
	 id: 1
	 title: this is the title of user 2
	 body: this is the body of the user 2
	]
	=================================================================
	    Example 4: JSON to Java Conversion with implicit Json String
	=================================================================
	----- JSON -----
	
	{"userId": 1, "id": 1, "title": "this is the title", "body": "this is the body" }
	
	------ Java Object ------
	
	[
	 userId: 1
	 id: 1
	 title: this is the title
	 body: this is the body
	]
	
	--------- JSON --------
	{"userId":"1","id":"1","title":"this is the title","body":"this is the body"}
	Picked up _JAVA_OPTIONS: -Xms1024M
