package com.github.salomonbrys.kodein

/**
 * Starts the binding of a given type with a given tag.
 *
 * T generics will be kept.
 *
 * @param T The type to bind.
 * @param tag The tag to bind.
 * @param overrides Whether this bind **must**, **may** or **must not** override an existing binding.
 * @return The binder: call [Kodein.Builder.TBuilder.TypeBinder.with]) on it to finish the binding syntax and register the binding.
 */
inline fun <reified T : Any> Kodein.Builder.bind(tag: Any? = null, overrides: Boolean? = null) = bindGeneric<T>(tag, overrides)

/**
 * Binds the previously given tag to the given instance.
 *
 * T generics will be kept.
 *
 * @param T The type of value to bind.
 * @param value The instance to bind.
 */
infix inline fun <reified T : Any> Kodein.Builder.ConstantBinder.with(value: T) = withGeneric(value)
