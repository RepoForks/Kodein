[com.github.salomonbrys.kodein](../../index.md) / [KodeinContainer](../index.md) / [Builder](index.md) / [bind](.)

# bind

`fun bind(key: `[`Key`](../../-kodein/-key/index.md)`, overrides: Boolean? = null): `[`KeyBinder`](-key-binder/index.md)

Starts the binding of a given key.

### Parameters

`key` - The key to bind.

`overrides` - Whether this bind **must**, **may** or **must not** override an existing binding.

**Return**
The binder: call [KeyBinder.with](-key-binder/with.md)) on it to finish the binding syntax and register the binding.

`fun bind(bind: `[`Bind`](../../-kodein/-bind/index.md)`, overrides: Boolean? = null): `[`BindBinder`](-bind-binder/index.md)

Starts the binding of a given type and tag.

### Parameters

`bind` - The type and tag to bind.

`overrides` - Whether this bind **must**, **may** or **must not** override an existing binding.

**Return**
The binder: call [BindBinder.with](-bind-binder/with.md)) on it to finish the binding syntax and register the binding.

