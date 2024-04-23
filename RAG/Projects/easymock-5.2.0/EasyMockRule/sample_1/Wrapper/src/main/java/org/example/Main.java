package org.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.easymock.EasyMockRule;
import org.easymock.EasyMock;

public class Main {

  @Rule
  public EasyMockRule mockRule = new EasyMockRule(this);

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void myMethod_exception_rule() {
    OtherClass mockOther = mockRule.createNiceMock(OtherClass.class);

    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("some message");

    EasyMock.expect(mockOther.someMethod()).andThrow(new IllegalArgumentException("some message"));
    mockRule.replayAll();

    MyClass myClass = new MyClass(mockOther);
    myClass.myMethod();
  }
}