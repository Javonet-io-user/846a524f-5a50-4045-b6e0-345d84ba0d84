package Newtonsoft.Json.Serialization;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Newtonsoft.Json.Serialization.*;

public class SnakeCaseNamingStrategy extends NamingStrategy {
  public NObject javonetHandle;

  public SnakeCaseNamingStrategy(
      java.lang.Boolean processDictionaryKeys, java.lang.Boolean overrideSpecifiedNames) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Newtonsoft.Json.Serialization.SnakeCaseNamingStrategy",
              processDictionaryKeys,
              overrideSpecifiedNames);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SnakeCaseNamingStrategy(
      java.lang.Boolean processDictionaryKeys,
      java.lang.Boolean overrideSpecifiedNames,
      java.lang.Boolean processExtensionDataNames) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Newtonsoft.Json.Serialization.SnakeCaseNamingStrategy",
              processDictionaryKeys,
              overrideSpecifiedNames,
              processExtensionDataNames);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SnakeCaseNamingStrategy() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Serialization.SnakeCaseNamingStrategy");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SnakeCaseNamingStrategy(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
