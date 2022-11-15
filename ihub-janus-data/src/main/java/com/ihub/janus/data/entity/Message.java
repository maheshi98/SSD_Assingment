package com.ihub.janus.data.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonView;
import com.ihub.janus.data.view.Views;
import lombok.Getter;
import lombok.Setter;

/**
 * The Class Issue.
 */
@Entity
@Table(name = "message")
@Getter
@Setter
public class Message extends BaseEntity {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 0;
    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;
    /** The identifier. */
    @NotNull
    @Column(name = "identifier", unique = true, updatable = false)
    private String identifier;

    @Column(name = "description")
    private String description;

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", identifier='" + identifier + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
