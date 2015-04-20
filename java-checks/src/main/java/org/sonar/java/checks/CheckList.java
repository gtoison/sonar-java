/*
 * SonarQube Java
 * Copyright (C) 2012 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.java.checks;

import com.google.common.collect.ImmutableList;
import org.sonar.plugins.java.api.JavaCheck;

import java.util.List;

public final class CheckList {

  public static final String REPOSITORY_KEY = "squid";

  private CheckList() {
  }

  public static List<Class> getChecks() {
    return ImmutableList.<Class>builder().addAll(getJavaChecks()).addAll(getJavaTestChecks()).build();
  }

  public static List<Class<? extends JavaCheck>> getJavaChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder()
      .add(TabCharacter_S00105_Check.class)
      .add(TooLongLine_S00103_Check.class)
      .add(MissingNewLineAtEndOfFile_S00113_Check.class)
      .add(ParsingErrorCheck.class)
      .add(MethodComplexityCheck.class)
      .add(ClassComplexityCheck.class)
      .add(UndocumentedApiCheck.class)
      .add(NoSonarCheck.class)
      .add(CommentedOutCodeLineCheck.class)
      .add(EmptyFileCheck.class)
      .add(EmptyBlock_S00108_Check.class)
      .add(TooManyLinesOfCodeInFile_S00104_Check.class)
      .add(TooManyParameters_S00107_Check.class)
      .add(RawException_S00112_Check.class)
      .add(BadMethodName_S00100_Check.class)
      .add(BadClassName_S00101_Check.class)
      .add(BadInterfaceName_S00114_Check.class)
      .add(BadConstantName_S00115_Check.class)
      .add(BadFieldName_S00116_Check.class)
      .add(BadLocalVariableName_S00117_Check.class)
      .add(BadAbstractClassName_S00118_Check.class)
      .add(BadTypeParameterName_S00119_Check.class)
      .add(BadPackageName_S00120_Check.class)
      .add(MissingCurlyBraces_S00121_Check.class)
      .add(TooManyStatementsPerLine_S00122_Check.class)
      .add(LeftCurlyBraceStartLineCheck.class)
      .add(RightCurlyBraceSameLineAsNextBlockCheck.class)
      .add(RightCurlyBraceStartLineCheck.class)
      .add(RightCurlyBraceDifferentLineAsNextBlockCheck.class)
      .add(LeftCurlyBraceEndLineCheck.class)
      .add(UselessParenthesesCheck.class)
      .add(ObjectFinalizeCheck.class)
      .add(ObjectFinalizeOverridenCheck.class)
      .add(ObjectFinalizeOverridenCallsSuperFinalizeCheck.class)
      .add(ClassVariableVisibilityCheck.class)
      .add(ForLoopCounterChangedCheck.class)
      .add(LabelsShouldNotBeUsedCheck.class)
      .add(SwitchLastCaseIsDefaultCheck.class)
      .add(EmptyStatementUsageCheck.class)
      .add(ModifiersOrderCheck.class)
      .add(AssignmentInSubExpressionCheck.class)
      .add(StringEqualityComparisonCheck.class)
      .add(TrailingCommentCheck.class)
      .add(UselessImportCheck.class)
      .add(LowerCaseLongSuffixCheck.class)
      .add(MissingDeprecatedCheck.class)
      .add(IndentationCheck.class)
      .add(HiddenFieldCheck.class)
      .add(DeprecatedTagPresenceCheck.class)
      .add(FixmeTagPresenceCheck.class)
      .add(TodoTagPresenceCheck.class)
      .add(UtilityClassWithPublicConstructorCheck.class)
      .add(StringLiteralInsideEqualsCheck.class)
      .add(ReturnOfBooleanExpressionsCheck.class)
      .add(BooleanLiteralCheck.class)
      .add(ExpressionComplexityCheck.class)
      .add(NestedTryCatchCheck.class)
      .add(SystemExitCalledCheck.class)
      .add(ReturnInFinallyCheck.class)
      .add(IfConditionAlwaysTrueOrFalseCheck.class)
      .add(CaseInsensitiveComparisonCheck.class)
      .add(MethodWithExcessiveReturnsCheck.class)
      .add(CollectionIsEmptyCheck.class)
      .add(SynchronizedClassUsageCheck.class)
      .add(NonStaticClassInitializerCheck.class)
      .add(ReturnEmptyArrayNotNullCheck.class)
      .add(ConstantsShouldBeStaticFinalCheck.class)
      .add(ThrowsFromFinallyCheck.class)
      .add(SystemOutOrErrUsageCheck.class)
      .add(ExceptionsShouldBeImmutableCheck.class)
      .add(CollapsibleIfCandidateCheck.class)
      .add(NestedIfStatementsCheck.class)
      .add(CatchOfThrowableOrErrorCheck.class)
      .add(ImplementsEnumerationCheck.class)
      .add(CloneMethodCallsSuperCloneCheck.class)
      .add(SwitchCaseTooBigCheck.class)
      .add(SwitchCaseWithoutBreakCheck.class)
      .add(CatchUsesExceptionWithContextCheck.class)
      .add(MethodTooBigCheck.class)
      .add(EnumAsIdentifierCheck.class)
      .add(AnonymousClassesTooBigCheck.class)
      .add(SunPackagesUsedCheck.class)
      .add(SeveralBreakOrContinuePerLoopCheck.class)
      .add(EmptyMethodsCheck.class)
      .add(MethodOnlyCallsSuperCheck.class)
      .add(ObjectFinalizeOverridenNotPublicCheck.class)
      .add(ObjectFinalizeOverloadedCheck.class)
      .add(ConcatenationWithStringValueOfCheck.class)
      .add(PrintStackTraceCalledWithoutArgumentCheck.class)
      .add(ArrayDesignatorAfterTypeCheck.class)
      .add(ErrorClassExtendedCheck.class)
      .add(InstanceofUsedOnExceptionCheck.class)
      .add(StringLiteralDuplicatedCheck.class)
      .add(ToStringUsingBoxingCheck.class)
      .add(GarbageCollectorCalledCheck.class)
      .add(ArrayDesignatorOnVariableCheck.class)
      .add(DefaultPackageCheck.class)
      .add(MethodNamedHashcodeOrEqualCheck.class)
      .add(NestedBlocksCheck.class)
      .add(InterfaceAsConstantContainerCheck.class)
      .add(MethodNamedEqualsCheck.class)
      .add(EqualsNotOverridenWithCompareToCheck.class)
      .add(EqualsOverridenWithHashCodeCheck.class)
      .add(SwitchWithLabelsCheck.class)
      .add(SwitchAtLeastThreeCasesCheck.class)
      .add(ClassCouplingCheck.class)
      .add(OctalValuesCheck.class)
      .add(NoPmdTagPresenceCheck.class)
      .add(NoCheckstyleTagPresenceCheck.class)
      .add(ParameterReassignedToCheck.class)
      .add(HardcodedIpCheck.class)
      .add(LoggersDeclarationCheck.class)
      .add(ObjectEqualsNullCheck.class)
      .add(MethodNameSameAsClassCheck.class)
      .add(CollectionImplementationReferencedCheck.class)
      .add(IncorrectOrderOfMembersCheck.class)
      .add(PublicStaticFieldShouldBeFinalCheck.class)
      .add(WildcardReturnParameterTypeCheck.class)
      .add(UnusedLocalVariableCheck.class)
      .add(UnusedPrivateFieldCheck.class)
      .add(StringBufferAndBuilderWithCharCheck.class)
      .add(FileHeaderCheck.class)
      .add(IncrementDecrementInSubExpressionCheck.class)
      .add(CollectionsEmptyConstantsCheck.class)
      .add(UselessExtendsCheck.class)
      .add(CycleBetweenPackagesCheck.class)
      .add(DITCheck.class)
      .add(ArchitectureCheck.class)
      .add(CallToDeprecatedMethodCheck.class)
      .add(CallToFileDeleteOnExitMethodCheck.class)
      .add(UnusedProtectedMethodCheck.class)
      .add(UnusedPrivateMethodCheck.class)
      .add(RedundantThrowsDeclarationCheck.class)
      .add(ThrowsSeveralCheckedExceptionCheck.class)
      .add(ThreadRunCheck.class)
      .add(DuplicateConditionIfElseIfCheck.class)
      .add(ImmediatelyReturnedVariableCheck.class)
      .add(LambdaSingleExpressionCheck.class)
      .add(LambdaOptionalParenthesisCheck.class)
      .add(AnonymousClassShouldBeLambdaCheck.class)
      .add(AbstractClassNoFieldShouldBeInterfaceCheck.class)
      .add(SAMAnnotatedCheck.class)
      .add(CatchNPECheck.class)
      .add(FieldNameMatchingTypeNameCheck.class)
      .add(AbstractClassWithoutAbstractMethodCheck.class)
      .add(UnusedMethodParameterCheck.class)
      .add(FieldMatchMethodNameCheck.class)
      .add(MagicNumberCheck.class)
      .add(StringConcatenationInLoopCheck.class)
      .add(CompareObjectWithEqualsCheck.class)
      .add(ArrayEqualsCheck.class)
      .add(RepeatAnnotationCheck.class)
      .add(NPEThrowCheck.class)
      .add(NullDereferenceInConditionalCheck.class)
      .add(SelfAssignementCheck.class)
      .add(MismatchPackageDirectoryCheck.class)
      .add(ReplaceLambdaByMethodRefCheck.class)
      .add(StaticFinalArrayNotPrivateCheck.class)
      .add(FieldModifierCheck.class)
      .add(SerializableFieldInSerializableClassCheck.class)
      .add(PackageInfoCheck.class)
      .add(SwitchWithTooManyCasesCheck.class)
      .add(IdenticalCasesInSwitchCheck.class)
      .add(IdenticalOperandOnBinaryExpressionCheck.class)
      .add(FloatEqualityCheck.class)
      .add(SQLInjectionCheck.class)
      .add(TernaryOperatorCheck.class)
      .add(OverrideAnnotationCheck.class)
      .add(ForLoopIncrementAndUpdateCheck.class)
      .add(EmptyClassCheck.class)
      .add(InstanceOfAlwaysTrueCheck.class)
      .add(RedundantTypeCastCheck.class)
      .add(ExtendDeprecatedSymbolCheck.class)
      .add(CollectionCallingItselfCheck.class)
      .add(UnusedLabelCheck.class)
      .add(ThrowCheckedExceptionCheck.class)
      .add(CastArithmeticOperandCheck.class)
      .add(IgnoredReturnValueCheck.class)
      .add(ToStringReturningNullCheck.class)
      .add(TransactionalMethodVisibilityCheck.class)
      .add(CompareToResultTestCheck.class)
      .add(SecureCookieCheck.class)
      .add(UselessObjectCreationCheck.class)
      .add(CatchIllegalMonitorStateExceptionCheck.class)
      .add(ForLoopTerminationConditionCheck.class)
      .add(HttpRefererCheck.class)
      .add(HardCodedCredentialsCheck.class)
      .add(PseudoRandomCheck.class)
      .add(MainMethodThrowsExceptionCheck.class)
      .add(ResultSetIsLastCheck.class)
      .add(HasNextCallingNextCheck.class)
      .add(ThreadWaitCallCheck.class)
      .add(WaitOnConditionCheck.class)
      .add(DisallowedMethodCheck.class)
      .add(ForLoopIncrementSignCheck.class)
      .add(ForLoopFalseConditionCheck.class)
      .add(DeprecatedHashAlgorithmCheck.class)
      .add(NullCipherCheck.class)
      .add(GetRequestedSessionIdCheck.class)
      .add(ConcurrentLinkedQueueSizeCheck.class)
      .add(ServletInstanceFieldCheck.class)
      .add(BigDecimalDoubleConstructorCheck.class)
      .add(ReflectionOnNonRuntimeAnnotationCheck.class)
      .add(WaitInSynchronizeCheck.class)
      .add(ThreadSleepCheck.class)
      .add(WaitInWhileLoopCheck.class)
      .add(IteratorNextExceptionCheck.class)
      .add(AvoidDESCheck.class)
      .add(RSAUsesOAEPCheck.class)
      .add(ConstructorCallingOverridableCheck.class)
      .add(EqualsOnAtomicClassCheck.class)
      .add(LDAPInjectionCheck.class)
      .add(NonShortCircuitLogicCheck.class)
      .add(OSCommandInjectionCheck.class)
      .add(ArrayHashCodeAndToStringCheck.class)
      .add(DefaultEncodingUsageCheck.class)
      .add(CloneableImplementingCloneCheck.class)
      .add(PrintfCheck.class)
      .add(ModulusEqualityCheck.class)
      .add(RunFinalizersCheck.class)
      .add(LongBitsToDoubleOnIntCheck.class)
      .add(SynchronizationOnStringOrBoxedCheck.class)
      .add(SerializableSuperConstructorCheck.class)
      .add(NonSerializableWriteCheck.class)
      .add(InnerClassOfSerializableCheck.class)
      .add(InnerClassOfNonSerializableCheck.class)
      .add(SerialVersionUidCheck.class)
      .add(SerializableComparatorCheck.class)
      .add(TransientFieldInNonSerializableCheck.class)
      .add(CustomSerializationMethodCheck.class)
      .add(InterfaceOrSuperclassShadowingCheck.class)
      .add(RedundantModifierCheck.class)
      .add(MathOnFloatCheck.class)
      .add(StringToPrimitiveConversionCheck.class)
      .add(ClassNamedLikeExceptionCheck.class)
      .add(ProtectedMemberInFinalClassCheck.class)
      .add(SuppressWarningsCheck.class)
      .add(ImmediateReverseBoxingCheck.class)
      .add(CustomCryptographicAlgorithmCheck.class)
      .add(UnusedTypeParameterCheck.class)
      .add(InterfaceStaticMutableMemberCheck.class)
      .add(ShiftOnIntOrLongCheck.class)
      .add(CompareToReturnValueCheck.class)
      .add(FinalizeFieldsSetCheck.class)
      .add(NotifyCheck.class)
      .add(ScheduledThreadPoolExecutorZeroCheck.class)
      .add(ThreadOverridesRunCheck.class)
      .add(CollectionInappropriateCallsCheck.class)
      .add(BooleanMethodReturnCheck.class)
      .add(PrimitiveTypeBoxingWithToStringCheck.class)
      .add(SillyBitOperationCheck.class)
      .add(InvalidDateValuesCheck.class)
      .add(EqualsNotOverriddenInSubclassCheck.class)
      .add(ClassComparedByNameCheck.class)
      .add(ClassWithOnlyStaticMethodsInstantiationCheck.class)
      .add(SerializableObjectInSessionCheck.class)
      .add(StaticFieldInitializationCheck.class)
      .add(UselessIncrementCheck.class)
      .add(ObjectCreatedOnlyToCallGetClassCheck.class)
      .add(PrimitiveWrappersInTernaryOperatorCheck.class)
      .add(SynchronizedLockCheck.class)
      .add(SymmetricEqualsCheck.class)
      .add(CallSuperMethodFromInnerClassCheck.class)
      .add(SelectorMethodArgumentCheck.class)
      .add(ThreadAsRunnableArgumentCheck.class)
      .add(SynchronizedFieldAssignmentCheck.class)
      .add(NullPointerCheck.class)
      .add(UselessConditionCheck.class)
      .add(StaticFieldUpateCheck.class)
      .add(IgnoredStreamReturnValueCheck.class)
      .add(DateUtilsTruncateCheck.class)
      .add(PreparedStatementAndResultSetCheck.class)
      .add(URLHashCodeAndEqualsCheck.class)
      .add(ChildClassShadowFieldCheck.class)
      .build();
  }

  public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder()
        .add(IgnoredTestsCheck.class)
        .add(BooleanLiteralInAssertionsCheck.class)
        .build();
  }
}
