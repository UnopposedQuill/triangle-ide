/*
 * @(#)WhileCommand.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class LoopCommand extends Command {

  /**
   * This creates a new LoopCommand AST
   * @param eAST It's control expression
   * @param cAST It's command
   * @param thePosition Where it can be found in the source
   * @param tokenKind Two kinds of loop: While or Until
   */
  public LoopCommand (Expression eAST, Command cAST, SourcePosition thePosition, int tokenKind) {
    super (thePosition);
    E = eAST;
    C = cAST;
    T = tokenKind;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return v.visitLoopCommand(this, o);
  }

  public Expression E;
  public Command C;
  public int T;//Token.Kind
}
