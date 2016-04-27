package com.beehase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SampleTest {
    @Spy
    private Sample tested;

    @Test
    public void sayHello() {
        assertThat(tested.sayHello(), is("hello"));
    }
}
