class WitherWithGenerics<T, J extends T, L extends java.lang.Number> {
  @lombok.experimental.Wither J test;
  @lombok.experimental.Wither java.util.List<L> test2;
  @lombok.experimental.Wither java.util.List<? extends L> test3;
  int $i;
  public WitherWithGenerics(J test, java.util.List<L> test2, java.util.List<? extends L> test3) {
    super();
  }
  public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated WitherWithGenerics<T, J, L> withTest(final J test) {
    return ((this.test == test) ? this : new WitherWithGenerics<T, J, L>(test, this.test2, this.test3));
  }
  public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated WitherWithGenerics<T, J, L> withTest2(final java.util.List<L> test2) {
    return ((this.test2 == test2) ? this : new WitherWithGenerics<T, J, L>(this.test, test2, this.test3));
  }
  public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated WitherWithGenerics<T, J, L> withTest3(final java.util.List<? extends L> test3) {
    return ((this.test3 == test3) ? this : new WitherWithGenerics<T, J, L>(this.test, this.test2, test3));
  }
}
