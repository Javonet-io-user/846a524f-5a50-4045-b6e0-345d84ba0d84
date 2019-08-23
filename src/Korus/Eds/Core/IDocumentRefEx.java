package Korus.Eds.Core;

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
import Korus.Eds.Core.*;

public interface IDocumentRefEx extends IDocumentRef {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDocumentTypeCode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getReceiverCode();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDocumentTypeCode(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setReceiverCode(java.lang.String value);
}
