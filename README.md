*Exploring Android Navigation Component*
**Mentioned bugs and problems**
***Bug with opening new Activity when action has animations***
When action has custom animations, like this:
```
<action
   android:id="@+id/action_list_to_supportActivity"
   app:destination="@id/supportActivity"
   app:enterAnim="@anim/nav_default_enter_anim"
   app:exitAnim="@anim/nav_default_exit_anim"
   app:popEnterAnim="@anim/nav_default_pop_enter_anim"
   app:popExitAnim="@anim/nav_default_pop_exit_anim" />
```

And you try to user safeargs:
```
findNavController().navigate(ListScreenDirections.actionListToSupportActivity())
```

Then Activity will not shown, but will be added to back stack!