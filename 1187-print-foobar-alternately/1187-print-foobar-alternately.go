type FooBar struct {
	n   int
	chA chan struct{}
	chB chan struct{}
}

func NewFooBar(n int) *FooBar {
	f := FooBar{n: n}
	f.chA = make(chan struct{}, 1)
	f.chB = make(chan struct{}, 1)
	return &f
}

func (fb *FooBar) Foo(printFoo func()) {
	for i := 0; i < fb.n; i++ {
		// printFoo() outputs "foo". Do not change or remove this line.
		if i > 0 {
			<-fb.chB
		}
		printFoo()
		fb.chA <- struct{}{}
	}
}

func (fb *FooBar) Bar(printBar func()) {
	for i := 0; i < fb.n; i++ {
		// printBar() outputs "bar". Do not change or remove this line.
		<-fb.chA
		printBar()
		fb.chB <- struct{}{}
	}

}