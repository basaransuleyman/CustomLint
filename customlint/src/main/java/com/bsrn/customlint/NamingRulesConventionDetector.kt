package com.bsrn.customlint

import com.android.tools.lint.detector.api.Detector
import com.android.tools.lint.detector.api.JavaContext
import com.android.tools.lint.detector.api.SourceCodeScanner
import com.bsrn.customlint.SourcesOfRules.Companion.ISSUE_NAMING_CONVENTION
import org.jetbrains.uast.UClass

class NamingRulesConventionDetector : Detector(), SourceCodeScanner {
    override fun getApplicableElements(): List<String> {
        return listOf("androidx.fragment.app.Fragment", "android.app.Activity")
    }

    override fun visitClass(context: JavaContext, declaration: UClass) {
        val name = declaration.name
        if (name != null && !name.endsWith("Activity") && !name.endsWith("Fragment")) {
            context.report(
                ISSUE_NAMING_CONVENTION,
                declaration,
                context.getNameLocation(declaration),
                "Class name should end with 'Activity' or 'Fragment'."
            )
        }
    }

}