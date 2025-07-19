2 x 3 = MULTIPLY2 3 :⇔ (λ abc.a(bc)) (λ sz.s(s(z))) (λ xy.x(x(x(y))))

= λ c.(λ sz.s(s(z)))((λ xy.x(x(x(y))))c)

= λ cz.((λ xy.x(x(x(y))))c)(((λ xy.x(x(x(y))))c)(z))

= λ cz.(λ y.c(c(c(y)))) (c(c(c(z))))

= λ cz.c(c(c(c(c(c(z)))))) = 6