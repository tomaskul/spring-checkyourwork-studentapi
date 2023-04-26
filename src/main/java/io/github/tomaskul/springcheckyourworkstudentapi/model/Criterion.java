package io.github.tomaskul.springcheckyourworkstudentapi.model;

/**
 * Assessment criterion
 */
public interface Criterion {
    String getName();
    String getDescription();
    boolean evaluate();
}
