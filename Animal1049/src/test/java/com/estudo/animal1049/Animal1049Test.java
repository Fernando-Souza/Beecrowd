package com.estudo.animal1049;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class Animal1049Test {

    @Rule
    public SystemOutRule systemOutRule = new SystemOutRule().enableLog();;
    @Rule
    public TextFromStandardInputStream systemInMock= emptyStandardInputStream();

    
    @Test
    public void testEncontrarNomeAnimal() {
        
        systemInMock.provideLines("vertebrado","mamifero","onivoro");
        Animal1049.main(new String[0]);
    
        assertThat(systemOutRule.getLog()).isEqualTo("homem");

    }

}
