// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ElixirUnmatchedOrOperation extends ElixirUnmatchedExpression, InfixOperation {

  @NotNull
  ElixirOrInfixOperator getOrInfixOperator();

  @NotNull
  List<ElixirUnmatchedExpression> getUnmatchedExpressionList();

  @NotNull
  Quotable leftOperand();

  @NotNull
  Operator operator();

  @NotNull
  OtpErlangObject quote();

  @NotNull
  Quotable rightOperand();

}
