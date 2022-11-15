/*
 * Copyright (c) iHub 2021. All rights reserved. <br><br> 
 *
 */
package com.ihub.janus.data.view;

/**
 * The Interface BaseViews.
 */
public interface Views {

	/**
	 * The Interface BaseEntity.
	 */
	public interface BaseEntity {

	}

	/**
	 * The Interface User.
	 */
	public class User {

	}

	/*
	 * public interface Role {
	 * 
	 * }
	 */

	/*
	 * public class UserRole extends User implements Role {
	 * 
	 * }
	 */

	public interface UserDetails extends BaseEntity {

	}

	/**
	 * The Interface Role.
	 */
	public class Role extends User {

	}

	/**
	 * The Interface Project.
	 */
	public class Project extends User implements BaseEntity, Issue, Epic, Sprint {

	}
	
	public class ProjectUser extends User {

	}

	/**
	 * The Interface Attachment.
	 */
	public interface Attachment extends BaseEntity {

	}

	/**
	 * The Interface Task.
	 */
	public interface Task extends BaseEntity {

	}

	/**
	 * The Interface Issue.
	 */
	public interface Issue extends BaseEntity {

	}

	/**
	 * The Interface Epic.
	 */
	public interface Epic extends BaseEntity {

	}
	
	/*public interface Story extends BaseEntity {

	}*/

	/**
	 * The Interface Story.
	 */
	public class Story extends User implements BaseEntity  {

	}

	public interface PageView {

	}

	public class StoryPageable extends User implements  Epic, PageView {

	}

	/**
	 * The Interface Sprint.
	 */
	public interface Sprint extends BaseEntity {

	}

}
